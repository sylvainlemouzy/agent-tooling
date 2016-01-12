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
package fr.irit.smac.libs.tooling.avt.range.impl;

/**
 * The Class ImmutableRangeImpl.
 */
public class ImmutableRangeImpl extends AbstractRange {

    /** The lower bound. */
    private final double lowerBound;
    
    /** The upper bound. */
    private final double upperBound;

    /**
     * Instantiates a new immutable range impl.
     *
     * @param lowerBound the lower bound
     * @param upperBound the upper bound
     */
    public ImmutableRangeImpl(double lowerBound, double upperBound) {
        super();

        this.lowerBound = lowerBound;
        this.upperBound = upperBound;

        this.checkBoundsConsistency();
    }

    /* (non-Javadoc)
     * @see fr.irit.smac.libs.tooling.avt.range.IRange#getLowerBound()
     */
    @Override
    public double getLowerBound() {
        return this.lowerBound;
    }

    /* (non-Javadoc)
     * @see fr.irit.smac.libs.tooling.avt.range.IRange#getUpperBound()
     */
    @Override
    public double getUpperBound() {
        return this.upperBound;
    }

}
