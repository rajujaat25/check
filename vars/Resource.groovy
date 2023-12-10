def call()
{
  def content = libraryResource "bash.sh"
  WriteFile file: "pro.sh", text: content
  sh "ls -a ./pro.sh"
  sh "bash ./pro.sh"
}
