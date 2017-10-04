# neverendingservice
### Overview
This app starts a never ending service, which runs:
- immediately after boot
- when screen is off
- when the device is sleeping
- I don't know what happens when in doze mode! 

### Logic Diagram - Fig.1
[![N|Solid](https://www.dogsally.com/github/neverendingservice.jpg)](https://nodesource.com/products/nsolid)

Logic Diagram Explanation
- After booting, BootActivity receives BOOT_COMPLETED from Android System
- BootActivity starts the SensorService service and finish
- SensorService runs continuosly, even when screen is off or the device is in sleep mode. 
- Whenever Android kills SensorService, onDestroy broadcasts an intent to SensorRestasterBroadcastReceiver
- SensorRestasterBroadcastReceiver starts the SensorService service
- The MainActivity is useless at the moment, but it can be filled with user interactions
