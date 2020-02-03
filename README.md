# RewardedAdTest
ASUS X00AD Test with AdMob/Google Ad Unit IDs

App is crashing when rewarded ad opened on Asus ZB500KL device. It is running on emulator and Asus ZS620KL device successfully. 

Device: ASUS X00AD - Zenfone Go (ZB500KL) / Android 6.0.1 / API 23
Device: ASUS Z01RD - Zenfone 5z (ZS620KL) / Android 10
Device: NEXUS 5X / Android 6.0 / API 23 (Emulator)

Log:

02-03 23:01:42.342 10712-10712/com.project.demos.rewardedadtest I/MainActivity: Ad opened.
02-03 23:01:42.398 2922-2922/? W/Binder_4: type=1400 audit(0.0:1184): avc: denied { ioctl } for path="socket:[108342]" dev="sockfs" ino=108342 ioctlcmd=7704 scontext=u:r:system_server:s0 tcontext=u:r:system_server:s0 tclass=unix_stream_socket permissive=0
02-03 23:01:42.398 2922-2922/? W/Binder_4: type=1400 audit(0.0:1185): avc: denied { ioctl } for path="socket:[108342]" dev="sockfs" ino=108342 ioctlcmd=7704 scontext=u:r:system_server:s0 tcontext=u:r:system_server:s0 tclass=unix_stream_socket permissive=0
02-03 23:01:42.455 2955-2955/? D/PhoneStatusBar: setSystemUiVisibility vis=8000 mask=ffffffff oldVal=8600 newVal=8000 diff=600
02-03 23:01:42.567 10712-10722/com.project.demos.rewardedadtest I/art: Background sticky concurrent mark sweep GC freed 11503(1287KB) AllocSpace objects, 4(76KB) LOS objects, 8% free, 13MB/14MB, paused 5.291ms total 65.722ms
02-03 23:01:42.577 10712-10858/com.project.demos.rewardedadtest I/MediaCodec: [OMX.qcom.video.decoder.avc] setting surface generation to 10969090
02-03 23:01:42.580 1642-3555/? I/MediaFocusControl:  AudioFocus  requestAudioFocus() from android.media.AudioManager@73669a5com.google.android.gms.ads.internal.video.af@f9717a req=2flags=0x0
02-03 23:01:42.581 10712-10859/com.project.demos.rewardedadtest V/ACodec: gralloc usage: 0x42000000(OMX) => 0x42002900(ACodec)
02-03 23:01:42.582 10712-10859/com.project.demos.rewardedadtest D/SurfaceUtils: set up nativeWindow 0x557bb50160 for 1280x720, color 0x7fa30c04, rotation 0, usage 0x42002900
02-03 23:01:42.582 10712-10859/com.project.demos.rewardedadtest V/ACodec: rect size = 0, 0, 1280, 720
02-03 23:01:42.582 10712-10859/com.project.demos.rewardedadtest V/ACodec: crop update (0, 0), (1279, 719)
02-03 23:01:42.582 10712-10859/com.project.demos.rewardedadtest V/ACodec: setting up surface for 11 buffers
02-03 23:01:42.583 10712-10859/com.project.demos.rewardedadtest A/GraphicBuffer: getNativeBuffer() called on NULL GraphicBuffer
    
    --------- beginning of crash
02-03 23:01:42.583 10712-10859/com.project.demos.rewardedadtest A/libc: Fatal signal 6 (SIGABRT), code -6 in tid 10859 (CodecLooper)
02-03 23:01:42.637 306-306/? A/DEBUG: *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***
02-03 23:01:42.638 306-306/? A/DEBUG: Build fingerprint: 'asus/WW_Phone/ASUS_X00AD_2:6.0.1/MMB29M/13.0.0.321-20180626:user/release-keys'
02-03 23:01:42.638 306-306/? A/DEBUG: Revision: '0'
02-03 23:01:42.638 306-306/? A/DEBUG: ABI: 'arm64'
02-03 23:01:42.638 306-306/? A/DEBUG: pid: 10712, tid: 10859, name: CodecLooper  >>> com.project.demos.rewardedadtest <<<
02-03 23:01:42.638 306-306/? A/DEBUG: signal 6 (SIGABRT), code -6 (SI_TKILL), fault addr --------
02-03 23:01:42.638 306-306/? W/debuggerd64: type=1400 audit(0.0:1186): avc: denied { search } for name="com.project.demos.rewardedadtest" dev="mmcblk0p67" ino=179750 scontext=u:r:debuggerd:s0 tcontext=u:object_r:app_data_file:s0:c512,c768 tclass=dir permissive=0
02-03 23:01:42.648 306-306/? W/debuggerd64: type=1400 audit(0.0:1187): avc: denied { search } for name="com.google.android.gms" dev="mmcblk0p67" ino=113835 scontext=u:r:debuggerd:s0 tcontext=u:object_r:app_data_file:s0:c512,c768 tclass=dir permissive=0
02-03 23:01:42.648 306-306/? W/debuggerd64: type=1400 audit(0.0:1188): avc: denied { search } for name="com.google.android.gms" dev="mmcblk0p67" ino=113835 scontext=u:r:debuggerd:s0 tcontext=u:object_r:app_data_file:s0:c512,c768 tclass=dir permissive=0
02-03 23:01:42.648 306-306/? W/debuggerd64: type=1400 audit(0.0:1189): avc: denied { search } for name="com.google.android.gms" dev="mmcblk0p67" ino=113835 scontext=u:r:debuggerd:s0 tcontext=u:object_r:app_data_file:s0:c512,c768 tclass=dir permissive=0
02-03 23:01:42.689 306-306/? A/DEBUG: Abort message: 'getNativeBuffer() called on NULL GraphicBuffer'
02-03 23:01:42.689 306-306/? A/DEBUG:     x0   0000000000000000  x1   0000000000002a6b  x2   0000000000000006  x3   0000000000000000
02-03 23:01:42.689 306-306/? A/DEBUG:     x4   0000000000000000  x5   0000000000000001  x6   0000000000000000  x7   0000000000000000
02-03 23:01:42.690 306-306/? A/DEBUG:     x8   0000000000000083  x9   0000007f841c0000  x10  0000007f841c1012  x11  0000000000000000
02-03 23:01:42.690 306-306/? A/DEBUG:     x12  0000007f841c0000  x13  0000007f841ab090  x14  0000000000000001  x15  0000007f841afe39
02-03 23:01:42.690 306-306/? A/DEBUG:     x16  0000007f872f76a8  x17  0000007f872b9b9c  x18  0000000000000000  x19  0000007f5d980510
02-03 23:01:42.690 306-306/? A/DEBUG:     x20  0000007f5d980450  x21  0000000000000019  x22  0000000000000006  x23  0000000000000000
02-03 23:01:42.690 306-306/? A/DEBUG:     x24  000000557b846568  x25  0000000000000018  x26  0000007f872b6000  x27  000000557bb50150
02-03 23:01:42.690 306-306/? A/DEBUG:     x28  0000000000000000  x29  0000007f5d97fb80  x30  0000007f872b7338
02-03 23:01:42.690 306-306/? A/DEBUG:     sp   0000007f5d97fb80  pc   0000007f872b9ba4  pstate 0000000020000000
02-03 23:01:42.699 306-306/? A/DEBUG: backtrace:
02-03 23:01:42.700 306-306/? A/DEBUG:     #00 pc 000000000006aba4  /system/lib64/libc.so (tgkill+8)
02-03 23:01:42.700 306-306/? A/DEBUG:     #01 pc 0000000000068334  /system/lib64/libc.so (pthread_kill+68)
02-03 23:01:42.700 306-306/? A/DEBUG:     #02 pc 00000000000212b8  /system/lib64/libc.so (raise+28)
02-03 23:01:42.700 306-306/? A/DEBUG:     #03 pc 000000000001ba58  /system/lib64/libc.so (abort+60)
02-03 23:01:42.700 306-306/? A/DEBUG:     #04 pc 000000000000d0c0  /system/lib64/libcutils.so (__android_log_assert+236)
02-03 23:01:42.700 306-306/? A/DEBUG:     #05 pc 0000000000008790  /system/lib64/libui.so (_ZNK7android13GraphicBuffer15getNativeBufferEv+48)
02-03 23:01:42.700 306-306/? A/DEBUG:     #06 pc 000000000008f658  /system/lib64/libstagefright.so (_ZN7android6ACodec16handleSetSurfaceERKNS_2spINS_7SurfaceEEE+632)
02-03 23:01:42.700 306-306/? A/DEBUG:     #07 pc 0000000000098bec  /system/lib64/libstagefright.so (_ZN7android6ACodec9BaseState17onMessageReceivedERKNS_2spINS_8AMessageEEE+380)
02-03 23:01:42.701 306-306/? A/DEBUG:     #08 pc 000000000000dc40  /system/lib64/libstagefright_foundation.so (_ZN7android25AHierarchicalStateMachine13handleMessageERKNS_2spINS_8AMessageEEE+124)
02-03 23:01:42.701 306-306/? A/DEBUG:     #09 pc 000000000002b8b8  /system/vendor/lib64/libavenhancements.so
02-03 23:01:42.701 306-306/? A/DEBUG:     #10 pc 000000000000d9d0  /system/lib64/libstagefright_foundation.so (_ZN7android8AHandler14deliverMessageERKNS_2spINS_8AMessageEEE+32)
02-03 23:01:42.701 306-306/? A/DEBUG:     #11 pc 000000000001154c  /system/lib64/libstagefright_foundation.so (_ZN7android8AMessage7deliverEv+92)
02-03 23:01:42.701 306-306/? A/DEBUG:     #12 pc 000000000000ea60  /system/lib64/libstagefright_foundation.so (_ZN7android7ALooper4loopEv+404)
02-03 23:01:42.701 306-306/? A/DEBUG:     #13 pc 00000000000167b4  /system/lib64/libutils.so (_ZN7android6Thread11_threadLoopEPv+208)
02-03 23:01:42.701 306-306/? A/DEBUG:     #14 pc 0000000000016004  /system/lib64/libutils.so
02-03 23:01:42.701 306-306/? A/DEBUG:     #15 pc 0000000000067784  /system/lib64/libc.so (_ZL15__pthread_startPv+52)
02-03 23:01:42.701 306-306/? A/DEBUG:     #16 pc 000000000001c604  /system/lib64/libc.so (__start_thread+16)
