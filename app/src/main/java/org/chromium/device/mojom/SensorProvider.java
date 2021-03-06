
// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/device/public/interfaces/sensor_provider.mojom
//

package org.chromium.device.mojom;

import org.chromium.base.annotations.SuppressFBWarnings;
import org.chromium.mojo.bindings.DeserializationException;


public interface SensorProvider extends org.chromium.mojo.bindings.Interface {



    public interface Proxy extends SensorProvider, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<SensorProvider, SensorProvider.Proxy> MANAGER = SensorProvider_Internal.MANAGER;


    void getSensor(
int type, org.chromium.mojo.bindings.InterfaceRequest<Sensor> sensorRequest, 
GetSensorResponse callback);

    interface GetSensorResponse extends org.chromium.mojo.bindings.Callbacks.Callback2<SensorInitParams, org.chromium.mojo.bindings.InterfaceRequest<SensorClient>> { }


}
