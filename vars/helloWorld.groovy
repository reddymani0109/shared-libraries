def text='Dummy Text'

def call(String name){
  echo "Hello ${name}"
}
def showVersion(){
  sh 'java -version'
}
