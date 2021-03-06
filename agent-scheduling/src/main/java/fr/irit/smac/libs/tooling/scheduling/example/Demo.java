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
package fr.irit.smac.libs.tooling.scheduling.example;

import fr.irit.smac.libs.tooling.scheduling.IAgentStrategy;

public class Demo {

    private Demo() {

    }

    static class MyAgent implements IAgentStrategy {

        private final int id;

        MyAgent(int id) {
            this.id = id;
        }

        @Override
        public void nextStep() {
            System.out.println("Agent " + id + ": doing a step");

        }

    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        AllInOneSystem system = new AllInOneSystem();

        for (int i = 0; i < 10; i++) {
            system.addAgent(new MyAgent(i));
        }

    }

}
