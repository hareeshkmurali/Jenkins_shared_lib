def call(String oldName, String newName) {
    writeFile file: 'tempFile.ps1', text: "${libraryResource 'Powershell/Scripts/script.ps1'}"
    powershell './tempFile.ps1 -oldName $oldName -newName $newName'
}


