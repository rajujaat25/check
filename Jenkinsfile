 pipeline{
 agent any;
    stages{
    stage('git'){
     
       git 'https://github.com/rajujaat25/check.git'
     stash includes: "*" name: "frist"
      sh "ls"
    
    }
     stage('stash'){
 
     unstash "frist"
      sh "ls"
 
     
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
