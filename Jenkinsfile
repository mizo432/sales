node {
   stage ('git clone'){
      git 'https://github.com/mizo432/sales.git'
   }

   stage ('clean'){
      sh './gradlew --daemon clean'
   }

   stage ('build'){
      sh './gradlew --daemon :sales-externals:build'
      sh './gradlew --daemon :sales-core:build'
      sh './gradlew --daemon :sales-datasource:build'
      sh './gradlew --daemon :sales-report:build'
      sh './gradlew --daemon :sales-application:build'
      sh './gradlew --daemon :sales-web:build'
   }

   stage ('create reports'){
      sh './gradlew --daemon jacoco'

      sh './gradlew --daemon jdepend'

      sh './gradlew --daemon findbugsMain'

   }

// JUnitテストレポートを保存
   stage ('copy test report'){
      step([$class: 'JUnitResultArchiver', testResults: '**/build/test-results/*.xml'])
   }

   stage('assembles reports'){
        jacoco exclusionPattern: '**/*Test*.class'
        openTasks canComputeNew: false, defaultEncoding: '', excludePattern: '', healthy: '', high: 'FIXME', low: '', normal: 'TODO', pattern: '**/*.java', unHealthy: ''
        findbugs canComputeNew: false, defaultEncoding: '', excludePattern: '', healthy: '', includePattern: '', pattern: '**/build/reports/findbugs/*.xml', unHealthy: ''
   }
}