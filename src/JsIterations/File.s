//Javascript Map
//Javascript array
//Javascript List
let kvArray = [{ name: 1, value: 10 },
{ name: 2, value: 20 },
{ name: 3, value: 30 }]

console.log('Iterating using map')
kvArray.map((entry, index) => console.log(`${entry.name} : ${entry.value} --> ${index} `));

console.log('Iterating using for each')
kvArray.forEach((element, index) => console.log(`${element.name} : ${element.value} --> ${index}`))

console.log('Iterate using extended for loop[for...in]')
for (let index in kvArray) {
  console.log(`${kvArray[index].name} : ${kvArray[index].value}`)
}

console.log('Iterate using extended for loop [for...of]')
for (const element of kvArray) {
  console.log(element)
}

// JSON array
console.log('Working with json array');
const jsonArray = {
  '-MCs5EKz0bF99opb9bva': { amount: "10", title: "Banana" },
  '-MCs54gt685ks8Nr8HCL': { amount: "5", title: "Apple" },
  '-MCwuYaMyVHxpBXY7esc': { amount: "20", title: "Mango" }
}
console.log('Iterate over json array for...of');
for (key of Object.keys(jsonArray)) {
  console.log("---> "+jsonArray[key].title)
}


console.log('Iterate over json array for...in');
for (key in jsonArray) {
  console.log(key+"---> "+jsonArray[key].title+","+ jsonArray[key].amount)
}
