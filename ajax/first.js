console.log("ajax tutorial in one vidio:");

let fetchBtn=document.getElementById("fetch-btn");

fetchBtn.addEventListener('click',buttonClickHandler);

function buttonClickHandler(){
	//instantiate an xhr object
	
	const xhr= new XMLHttpRequest();
	
	//open the object 
	
    xhr.open('POST','https://jsonplaceholder.typicode.com/',true);     //GET	
	xhr.getResponseHeader('content-type',)
	
	//xhr.open('GET','chetan.txt',true);
    
    //what to do on progress

    xhr.onprogress=function(){
		console.log('on progress');
	}	
	
	//-----onreadystate
       
      xhr.onreadystatechange=function(){
		  console.log('ready state is ' + xhr.readystate);
	  }	   
	
	  // what to do when response is ready
	        xhr.onload=function(){
		//
	     if(this.status==200)
			 console.log(this.responseText);
		 
		 esle
			 console.log('some error occured');
		 
	}
	
	//send the request
	xhr.send();
	
	console.log("we are done ");
}