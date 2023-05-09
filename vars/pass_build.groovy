def call(Map config = [:]) {
    def scriptcontents = libraryResource "Powershell/Scripts/oddOrEven.sh"    
    writeFile file: "${config.name}", text: scriptcontents 
    sh "chmod a+x ./${config.name}"
    sh "./${config.name} ${config.number}"
}
