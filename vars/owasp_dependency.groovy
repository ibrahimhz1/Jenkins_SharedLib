def call(){
  dependencyCheck(
        additionalArguments: '--scan ./ --disableNvd',
        odcInstallation: 'OWASP'
    )
  dependencyCheckPublisher pattern: '**/dependency-check-report.xml'
}
