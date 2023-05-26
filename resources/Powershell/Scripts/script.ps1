param(
    [Parameter(Mandatory=$true)]
    [string]$oldName,
    
    [Parameter(Mandatory=$true)]
    [string]$newName
)

Rename-Item -Path $oldName -NewName $newName
