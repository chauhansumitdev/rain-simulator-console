﻿# Rain-Simulator-Console
> You can change the speed of rain by manipulating the `Thread.sleep()` method.

## Overview
`rain-simulator-console` is a simple console-based simulation that visualizes raindrops falling through a 20x20 grid `change accordingly` . Each raindrop is represented by a '*' character, and it moves from the top of the grid to the bottom, creating a rain-like effect.

## Features
- Real-time visualization of raindrops falling through a grid.
- Adjustable rain speed by changing the sleep duration in the `Thread.sleep()` method.
- Adjustable grid size.

## Customization

### Adjusting Rain Speed
To change the speed of the rain, modify the `Thread.sleep()` duration in the `render` method. For example, to make the rain fall faster, decrease the sleep time. To slow down the rain, increase the sleep time.

```java
Thread.sleep(100); // Current sleep time in milliseconds
```

### Grid Size
By default, the grid size is 10x10. To change the grid size, modify the `grid` method to return a different-sized array and adjust the loops in other methods accordingly.

## Example Output
```
  *      
    *    
*        
    *      
```


[Watch the video](https://github.com/chauhansumitdev/rain-simulator-console/blob/main/clip)
