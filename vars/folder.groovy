def call(String oldname, String newname) { 
    def scriptPath = libraryResource('Powershell/Scripts/folder.ps1')

    bat "powershell.exe -File ${scriptPath} -oldname '${oldname}' -newname '${newname}'"
}
