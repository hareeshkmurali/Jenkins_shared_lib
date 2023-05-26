def call(String oldName, String newName) {
    def powershellCommand = "powershell -Command \"& { Rename-Item -Path '${oldName}' -NewName '${newName}' }\""
    bat(powershellCommand)
}
