export class Restaurant {

    restaurantId:number;
    restaurantName:string;
    location:string;
    restaurantOwner:string;
    category:string;
    imageName:string;
    ratings:string;
    description:string;
    contactNumber:string;
 
    constructor( restaurantId:number,
     restaurantName:string,
     location:string,
     restaurantOwner:string,
     category:string,
     imageName:string,
     ratings:string,
     description:string,
     contactNumber:string){
 
    this.restaurantId=restaurantId;
    this.restaurantName=restaurantName;
    this.location=location;
    this.restaurantOwner=restaurantOwner;
    this.category=category;
    this.imageName=imageName;
    this.ratings=ratings;
    this.description=description;
    this.contactNumber=contactNumber;
 
     }
     



}
