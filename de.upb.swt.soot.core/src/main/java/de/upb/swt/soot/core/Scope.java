package de.upb.swt.soot.core;
/*-
 * #%L
 * Soot
 * %%
 * Copyright (C) 2019 Linghui Luo, Ben Hermann
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation, either version 2.1 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Lesser Public License for more details.
 *
 * You should have received a copy of the GNU General Lesser Public
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/lgpl-2.1.html>.
 * #L%
 */
import de.upb.swt.soot.core.inputlocation.AnalysisInputLocation;
import de.upb.swt.soot.core.signatures.PackageName;
import de.upb.swt.soot.core.types.ClassType;

/**
 * Definition of a scope
 *
 * @author Linghui Luo
 * @author Ben Hermann
 */
public class Scope {

  /** Define a scope consists of multiple inputLocations. */
  public Scope(AnalysisInputLocation... inputLocations) {
    // TODO Auto-generated constructor stub
  }

  /** Define a scope consists of multiple packages. */
  public Scope(PackageName... packages) {
    // TODO Auto-generated constructor stub
  }

  /** Define a scope consists of multiple classes. */
  public Scope(ClassType... classSignatures) {
    // TODO Auto-generated constructor stub
  }
}
