package ni.vsbuild.steps

import ni.vsbuild.BuildConfiguration

class TsTestStep extends LvStep {

   def seqPath
   def tsVersion
   def tsBitness

   TsTestStep(script, mapStep, lvVersion) {
      super(script, mapStep, lvVersion)
      this.seqPath = mapStep.get('sequence_path')
      this.tsVersion = mapStep.get('teststand_version')
      this.tsBitness = mapStep.get('teststand_bitness')
   }

   void executeStep(BuildConfiguration configuration) {
      script.TsTest(seqPath, tsVersion, tsBitness)
   }
}