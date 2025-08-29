#import "Killer.h"
#import <UIKit/UIKit.h>

@implementation Killer
RCT_EXPORT_MODULE()

// - (NSNumber *)multiply:(double)a b:(double)b {
//     NSNumber *result = @(a * b);

//     return result;
// }

// 新增 exitApp 方法
RCT_EXPORT_METHOD(exitApp) {
  dispatch_async(dispatch_get_main_queue(), ^{
    // 退出 App
    exit(0);
    // 或者 UIApplication.sharedApplication.terminateForReason() 需要 iOS 16+
  });
}

- (std::shared_ptr<facebook::react::TurboModule>)getTurboModule:
    (const facebook::react::ObjCTurboModule::InitParams &)params {
  return std::make_shared<facebook::react::NativeKillerSpecJSI>(params);
}

@end