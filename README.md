# CryptoFun

<br>
<p align="center">
  <img src="https://github.com/abhishekdubey331/CryptoFun/blob/main/banner.png" width="750"/>
</p>
<br>


CryptoFun is a Learning Project 📱 for Applying Android Architecture Components with exploring <b>Jetpack Compose</b>, <b>MVVM</b>, <b>Kotlin Coroutines</b>, <b>Kotlin Flows</b> using <b>Clean Architecture</b> approach.


### Implemented by Clean Architecture
The following diagram shows the structure of this project with 3 layers:
- Presentation
- Domain
- Data


## Libraries Used :books:
* [Compose][0] Toolkit for building native UI (in a declarative way - 100% Kotlin).
* [Coroutines][1] Library support for Kotlin coroutines.
* [Flows][2] Stream processing API, built on top of Coroutines.
* [Compose Navigation][3] for tabs navigation using Jetpack Compose.
* [Dagger Hilt][4] Dependency injection library for Android.
* [Retrofit][5] Type-safe REST client for Android to consume RESTful web services.

[0]:  https://developer.android.com/jetpack
[1]:  https://github.com/Kotlin/kotlinx.coroutines
[2]:  https://kotlin.github.io/kotlinx.coroutines/kotlinx-coroutines-core/kotlinx.coroutines.flow/-flow/
[3]:  https://developer.android.com/jetpack/compose/navigation
[4]:  https://dagger.dev/hilt/
[5]:  https://github.com/square/retrofit

<br>
<p align="left">
  <img src="https://github.com/abhishekdubey331/CryptoFun/blob/main/diagram.png" width="750"/>
</p>
<br>


### Package Structure

<br>
<p align="center">
  <img src="https://github.com/abhishekdubey331/CryptoFun/blob/main/package_structure.PNG" width="325"/>
</p>
<br>


### Communication between layers

1. UI calls method from ViewModel.
2. ViewModel executes Use case.
3. Use case gets data from Coin Repository.
4. Each Repository returns data from a Data Source.
5. Information flows back to the UI where we display the list of all coins.
6. User can click a coin to get open coin detail screen.

### API's Used
Get coins route:
https://api.coinpaprika.com/v1/coins

Get a coin by ID route:
https://api.coinpaprika.com/v1/coins/{coinId}


## License :oncoming_police_car:
    Copyright 2022 Fernando Prieto Moyano

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.