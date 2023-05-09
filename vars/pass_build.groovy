def call(Map config = [:]) {
    def scriptcontents = libraryResource "scripts/linux/oddOrEven.sh"    
    writeFile file: "${config.name}", text: scriptcontents 
    sh "chmod a+x ./${config.name}"
    sh "./${config.name} ${config.number}"
}
