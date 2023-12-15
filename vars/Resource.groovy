def call(){
  def content = libraryResource "bash.sh"
  writeFile File: "pro.sh", text: content
  sh "ls -a ./pro.sh"
  sh "ls -a ./pro.sh"
}
  
