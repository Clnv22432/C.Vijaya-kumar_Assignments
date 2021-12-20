const person = {
    firstName : "Vijaykumar",
    lastName : "Chowdam",
    greeting : function(){
        alert('Hi! I\m ' + this.firstName + ' ' + this.lastName + '.');
    }
};

document.write(person.firstName + " ");
document.write(person.lastName + " ");
console.log(person.greeting());