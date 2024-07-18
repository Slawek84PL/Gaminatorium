pipeline {
    agent any

    tools {
        gradle 'gradle'
    }

    stages {
        stage('Clear workspace') {
            steps {
                deleteDir();
            }
        }

        stage('Build') {
            steps {
                dir("gaminatorium-main/monolith"){
                    withGradle {
                       sh 'gradle clean build --stacktrace -i'
                    }
                }
            }
        }
    }
}