def call(Map stageParams) {

        BuildNumber: [[name:  stageParams.BuildNumber ]],
        UserName: [[ name: stageParams.UserName ]]
        Password: [[ pass: stageParams.Password ]]
        ComputerName: [[ name: stageParams.ComputerName ]]
        ServiceName: [[ service: stageParams.ServiceName ]]
        SourcePath: [[ source: stageParams.SourcePath ]]
        DirectoryPath: [[ path: stageParams.DirectoryPath ]]
    
  }
