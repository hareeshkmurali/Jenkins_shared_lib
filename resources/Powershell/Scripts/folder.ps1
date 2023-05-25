Param(
    [string]$oldName,
    [string]$newName
)
$ErrorActionPreference = "Stop"
Rename-Item -Path $oldName -NewName $newName
