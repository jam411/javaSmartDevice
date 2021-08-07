(1)コンパイル方法 (全てjavacする) (実行環境はresult.pngに記載)
javac Main.java Operater.java SmartDevice.java KeyDevice.java PowerDevice.java SwitchgearDevice.java Door.java AirCleaner.java AirConditioner.java Light.java Window.java Curtain.java Optimizer.java RoomTempOptimizer.java RoomLightOptimizer.java Meter.java

(2)実行方法
java -cp . Main

(3)説明
Main.java - main関数 オブジェクトの作成とテストケースの処理.
Operater.java - main関数から受け取ったオブジェクトや命令を受け取ってshow(),control(),optimize()を実行する.
SmartDevice.java - スマートデバイスの抽象クラス.
KeyDevice.java - 鍵操作のあるデバイスの親クラス.
PowerDevice.java - 電源操作のあるデバイスの親クラス.
SwitchgearDevice.java - 開閉操作のあるデバイスの親クラス.
Door.java - スマートドアクラス.
AirCleaner.java - スマート空気洗浄機クラス.
AirConditioner.java - スマートエアコンクラス.
Light.java - スマート照明クラス.
Window.java - スマート窓クラス.
Curtain.java - スマートカーテンクラス.
Optimizer.java - 最適化の抽象クラス.
RoomTempOptimizer.java - 室内気温最適化クラス.
RoomLightOptimizer.java - 室内光量最適化クラス.
Meter.java - メータクラス.