pipeline{
   agent any;
      stages{
      stage('git'){
         steps{
          git 'https://github.com/rajujaat25/check.git'
          }
         }
         post{
         success{
            sh "tar -cvf file.tar /var/lib/jenkins/workspace/github_pipeline"
         }
            failure{
            sh "date"
            }
            alwaya{
            sh "ifconfig"
            }
         }
         
       }
 }
