/*
 * #%L
 * agent-scheduling
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
package fr.irit.smac.libs.tooling.scheduling.contrib.gui;

import javax.swing.JFrame;

import fr.irit.smac.libs.tooling.scheduling.ISystemControlHandler;

/**
 * Provides a Swing GUI allowing to handle the execution of the agents of the system.
 *
 * @author jorquera
 */
public class SystemControllerFrame extends JFrame {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 147438810874039124L;

    /**
     * Instantiates a new system controller frame.
     *
     * @param systemControlHandler
     *            the system control handler
     */
    public SystemControllerFrame(ISystemControlHandler systemControlHandler) {
        this(systemControlHandler, 500);
    }

    /**
     * Instantiates a new system controller frame.
     *
     * @param systemControlHandler
     *            the system control handler
     * @param delay
     *            the delay
     */
    public SystemControllerFrame(ISystemControlHandler systemControlHandler,
        int delay) {
        SystemControllerPanel controlPannel = new SystemControllerPanel(
            systemControlHandler, delay);
        this.add(controlPannel);
        this.pack();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

}
