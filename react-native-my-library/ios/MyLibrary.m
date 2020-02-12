//
//  RNHello.m
//  fingerprintscanner
//
//  Created by Rabia on 06/02/2020.
//  Copyright © 2020 Facebook. All rights reserved.
//

// CalendarManager.m
#import <React/RCTLog.h>
#import <React/RCTConvert.h>
#import "MyLibrary.h"
@implementation MyLibrary

// To export a module named CalendarManager
RCT_EXPORT_MODULE();

RCT_EXPORT_METHOD(addEvent:(NSString *)name location:(NSString *)location)
{
 // NSString *loc=[RCTConvert NSString:location];
   RCTLogInfo(@"Pretending to create an event %@ at %@",name,location);
}
// This would name the module AwesomeCalendarManager instead
// RCT_EXPORT_MODULE(AwesomeCalendarManager);
RCT_EXPORT_METHOD(findEvents:(RCTResponseSenderBlock)callback)
{
  callback(@[@"hello from native ios my library"]);
}
@end
