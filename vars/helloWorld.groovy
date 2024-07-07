def call(String name){
  echo "Hello ${name}"
}
def showVersion(String lang){
  sh "$lang -version"
}
