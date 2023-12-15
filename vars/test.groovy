def call (name)
{
  sh "ifconfig"
  sh "cal"
  echo "${name}"
}
