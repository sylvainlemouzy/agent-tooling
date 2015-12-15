/*
 * #%L
 * avt
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
package fr.irit.smac.libs.tooling.avt.deltamanager.dmdecision.impl;

import fr.irit.smac.libs.tooling.avt.deltamanager.dmdecision.DMDecision;
import fr.irit.smac.libs.tooling.avt.deltamanager.dmdecision.DMDecisionFactory;

public class DelayedDMDFactory implements DMDecisionFactory {

	private final DMDecisionFactory nestedDMDecisonFactory;
	private final int increaseDelay;
	private final int decreaseDelay;

	public DelayedDMDFactory(DMDecisionFactory nestedDMDecisonFactory, int increaseDelay, int decreaseDelay) {
		super();
		this.nestedDMDecisonFactory = nestedDMDecisonFactory;
		this.increaseDelay = increaseDelay;
		this.decreaseDelay = decreaseDelay;
	}

	@Override
	public DMDecision createInstance() {
		return new DelayedDMD(this.nestedDMDecisonFactory.createInstance(), this.increaseDelay, this.decreaseDelay);
	}

}