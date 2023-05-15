def call(Map stageParams) {

        BuildNumber: [[name:  stageParams.BuildNumber ]],
        UserName: [[ url: stageParams.UserName ]]
        Password: [[ url: stageParams.Password ]]
        ComputerName: [[ url: stageParams.ComputerName ]]
        ServiceName: [[ url: stageParams.ServiceName ]]
        SourcePath: [[ url: stageParams.SourcePath ]]
        DirectoryPath: [[ url: stageParams.DirectoryPath ]]
    
  }
