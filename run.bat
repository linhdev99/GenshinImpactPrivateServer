@ECHO OFF
echo "Welcome to Genshin Impact by Peter Linh"
start cmd /k "java -jar .\grasscutter-1.1.2-dev.jar"
timeout 8
start cmd /k ".\proxy.bat"
@REM start cmd /k ".\mitmdump.exe -s .\proxy.py -k"
timeout 5
start /d "D:\Games\Genshin private\Genshin Impact\Genshin Impact game\" GenshinImpact.exe
timeout 3