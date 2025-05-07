# Helm Task
1. Java build  
   `gradlew clean build`
2. Docker build  
	`docker build -t cyclopeye/helm:v0.7 .`
3. Docker push  
	`docker image push cyclopeye/helm:v0.7`
4. Helm install  
   `helm install app ./Helm/helmChart --namespace homework`
4. Helm uninstall  
   `helm uninstall app --namespace homework`