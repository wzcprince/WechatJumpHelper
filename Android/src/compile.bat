
chcp 65001

REM javac 需要！！！
chcp 936 


set PATH=%PATH%;"C:\Program Files\Java\jdk-9.0.1\bin"


javac -g -encoding UTF-8 ./com/tencent/wechatjump/helper/bean/*.java ./com/tencent/wechatjump/helper/util/*.java ./com/tencent/wechatjump/helper/*.java


jar cvfm test.jar MANIFEST.MF -C com .


pause 
