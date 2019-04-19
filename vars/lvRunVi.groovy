def call(vi, option, lvVersion){
   echo "Running $vi."
   def logFileName = getLogName(vi)
   if (option == 1) {
     def versionPath = env."labviewPath_${lvVersion}"
     bat "LabVIEWCLI -LabVIEWPath \"${versionPath}\" -OperationName RunVI -VIPath \"$WORKSPACE\\$vi\" -LogFilePath \"$WORKSPACE\\lvRunVi_${logFileName}.log\""
   } else {
     labviewcli("-OperationName SecureRunVI -VIPath \"$WORKSPACE\\$vi\" -LogFilePath \"$WORKSPACE\\lvRunVi_${logFileName}.log\"", lvVersion)
   }
}
