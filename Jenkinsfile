node {
    stage 'git'
        git branch: "master", url: "http://192.168.42.201/test/spring-boot-web.git", CredentialsId:"42d325ea-4c42-4843-87b8-cfc88e6dd012"
    stage 'mvn'
        sh "'mvn' clean package"

    stage 'docker build'
        sh '''
            docker build -t 192.168.42.2:5000/test2 --no-cache=true .
        '''
    stage 'docker push'
        sh '''
            docker push 192.168.42.2:5000/test2
        '''

}