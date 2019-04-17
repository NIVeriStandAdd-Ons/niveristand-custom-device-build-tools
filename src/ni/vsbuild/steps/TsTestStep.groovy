package ni.vsbuild.steps

import ni.vsbuild.BuildConfiguration

class TsTestStep extends AbstractStep {

   def seqPath
   def tsVersion
   def tsBitness

   TsTestStep(script, mapStep) {
      this.script = script
      this.seqPath = mapStep.get('sequence_path')
      this.tsVersion = mapStep.get('teststand_version')
      this.tsBitness = mapStep.get('teststand_bitness')
   }

   void executeStep(BuildConfiguration configuration) {
      script.TsTest(seqPath, tsVersion, tsBitness)
   }
}