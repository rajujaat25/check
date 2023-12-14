 pipeline{
 agent any;
    stages{
    stage('git'){
    steps{
       git 'https://github.com/rajujaat25/check.git'
     stash include "*" name: "frist"
      sh "ls"
    }
    }
     stage('stash'){
     steps{
     unstash "frist"
      sh "ls"
     }
     
     }
     
    
     
    }
    post{
       success{
       sh "tar -cvf file.tar /var/lib/jenkins/workspace/pip"
       }
       failure{
       sh "ifconfig"
       } 
       always{
          sh "cal"
       }
       
    }
    
    
    
 }
