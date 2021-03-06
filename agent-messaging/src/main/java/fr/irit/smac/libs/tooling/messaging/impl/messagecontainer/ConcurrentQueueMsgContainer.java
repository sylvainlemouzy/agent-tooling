/*
 * #%L
 * agent-messaging
 * %%
 * Copyright (C) 2014 - 2015 IRIT - SMAC Team
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Lesser Public License for more details.
 * 
 * You should have received a copy of the GNU General Lesser Public
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/lgpl-3.0.html>.
 * #L%
 */
package fr.irit.smac.libs.tooling.messaging.impl.messagecontainer;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * Implementation of a message container based on a ConcurrentLinkedQueue.
 *
 * @author lemouzy
 * @param <T> the generic type
 */
public class ConcurrentQueueMsgContainer<T> implements
    IMsgContainer<T> {

    /** The msg queue. */
    private ConcurrentLinkedQueue<T> msgQueue;

    /**
     * Instantiates a new concurrent queue msg container.
     */
    private ConcurrentQueueMsgContainer() {
        this.msgQueue = new ConcurrentLinkedQueue<T>();
    }

    /* (non-Javadoc)
     * @see fr.irit.smac.libs.tooling.messaging.impl.messagecontainer.IMsgSink#putMsg(java.lang.Object)
     */
    @Override
    public boolean putMsg(T msg) {
        return this.msgQueue.offer(msg);
    }

    /* (non-Javadoc)
     * @see fr.irit.smac.libs.tooling.messaging.impl.messagecontainer.IMsgSource#getMsgs()
     */
    @Override
    public List<T> getMsgs() {
        List<T> messages = new ArrayList<T>(/*this.msgQueue.size()*/);
        while (!this.msgQueue.isEmpty()) {
            messages.add(this.msgQueue.poll());
        }

        return messages;
    }

}