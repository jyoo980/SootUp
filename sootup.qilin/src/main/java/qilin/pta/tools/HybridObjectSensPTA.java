/* Qilin - a Java Pointer Analysis Framework
 * Copyright (C) 2021-2030 Qilin developers
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation, either version 3.0 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Lesser Public License for more details.
 *
 * You should have received a copy of the GNU General Lesser Public
 * License along with this program.  If not, see
 * <https://www.gnu.org/licenses/lgpl-3.0.en.html>.
 */

package qilin.pta.tools;

import qilin.core.PTAScene;
import qilin.parm.ctxcons.HybObjCtxConstructor;
import qilin.parm.heapabst.AllocSiteAbstractor;
import qilin.parm.heapabst.HeuristicAbstractor;
import qilin.parm.select.CtxSelector;
import qilin.parm.select.HeuristicSelector;
import qilin.parm.select.PipelineSelector;
import qilin.parm.select.UniformSelector;
import qilin.pta.PTAConfig;

/** refer to "Hybrid Context-Sensitivity for Points-To Analysis" (PLDI'13) */
public class HybridObjectSensPTA extends BasePTA {

  public HybridObjectSensPTA(PTAScene scene, int k, int hk) {
    super(scene);
    this.ctxCons = new HybObjCtxConstructor();
    CtxSelector us = new UniformSelector(k + 1, hk);
    if (PTAConfig.v().getPtaConfig().enforceEmptyCtxForIgnoreTypes) {
      this.ctxSel = new PipelineSelector(new HeuristicSelector(getView()), us);
    } else {
      this.ctxSel = us;
    }
    if (PTAConfig.v().getPtaConfig().mergeHeap) {
      this.heapAbst = new HeuristicAbstractor(pag);
    } else {
      this.heapAbst = new AllocSiteAbstractor();
    }
    System.out.println("Hybrid k-OBJ ...");
  }
}
