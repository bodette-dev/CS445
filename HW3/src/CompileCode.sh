echo "Installing Java JDK if necessary"
sudo apt install -y default-jdk
echo "Java Functionality Supported"
echo "Compiling Source Code..."
javac bulb/Lightbulb.java
javac bulb/LightbulbTest.java
javac button/Button.java
javac button/ButtonTest.java
javac button/PushdownButton.java
javac button/PushdownButtonTest.java
javac TableLamp.java
javac TableLampTest.java
javac PushdownTableLamp.java
javac PushdownTableLampTest.java
javac Test.java
echo "Source Code Compiled!"
