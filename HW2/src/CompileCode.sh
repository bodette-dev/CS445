echo "Installing Java JDK if necessary"
sudo apt install -y default-jdk
echo "Java Functionality Supported"
echo "Compiling Source Code..."
javac ImprovedRandom.java
javac ImprovedRandomTest.java
javac ImprovedStringTokenizer.java
javac ImprovedStringTokenizerTest.java
echo "Source Code Compiled!"
