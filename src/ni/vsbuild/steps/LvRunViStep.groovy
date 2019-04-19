package ni.vsbuild.steps

import ni.vsbuild.BuildConfiguration

class LvRunViStep extends LvStep {

   def vi
   def option

   LvRunViStep(script, mapStep, lvVersion) {
      super(script, mapStep, lvVersion)
      this.vi = mapStep.get('vi')
      this.option = mapStep.get('option')
   }

   void executeStep(BuildConfiguration configuration) {
      script.lvRunVi(vi, option, lvVersion)
   }
}
