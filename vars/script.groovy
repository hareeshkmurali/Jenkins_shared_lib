def call(String oldName, String newName) {
    writeFile file: 'tempFile.ps1', text: "${libraryResource 'Powershell/Scripts/script.ps1'}"
    bat "powershell -ExecutionPolicy ByPass -File "C:Users\\devopsdemo123\\AppData\\Local\\Jenkins\\.jenkins\\workspace\\sharedlibpipeline4\\tempFile.ps1""
    powershell './tempFile.ps1 -oldName ${oldName} -newName ${newName}'
}


