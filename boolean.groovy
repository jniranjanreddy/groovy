Boolean isDevelop = false
Boolean isProduction = false
def branchName = "production"

isDevelop = branchName == 'develop'
isProduction = branchName == 'production'

targetEnvCluster = (isProduction) ? 'production' : 'develop'
println(targetEnvCluster)