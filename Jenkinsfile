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
       sh "tar -cvf /var/lib/jenkins/workspace/pip
       }
       failure{
       sh "ifconfig"
       } 
       always{
          sh "cal"
       }
       
    }
    
    }
    
 }
