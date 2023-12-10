def call()
{
  def content = libraryResource "bash.sh"
  writeFile file: "pro.sh", text: content
  sh "ls -a ./pro.sh"
  sh "bash ./pro.sh"
}
