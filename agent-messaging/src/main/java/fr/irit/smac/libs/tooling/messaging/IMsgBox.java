/*
 * #%L
 * agent-tooling
 * %%
 * Copyright (C) 2014 IRIT - SMAC Team
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
package fr.irit.smac.libs.tooling.messaging;


import fr.irit.smac.libs.tooling.messaging.impl.Ref;

/**
 * The interface that will be used by agents to access the services of
 * agentMessaging
 * 
 * @author lemouzy
 *
 * @param <MsgType>
 */
public interface IMsgBox<MsgType> extends ISender<MsgType>, IReceiver<MsgType> {

	/**
	 * The ref of the agent using the message box
	 * 
	 * @return
	 */
	public Ref<MsgType> getRef();

	/**
	 * Disable the message box and uninscrible it to all the previously
	 * subscribed groups.
	 */
	public void dispose();
}
