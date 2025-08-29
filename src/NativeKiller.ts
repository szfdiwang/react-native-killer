import { TurboModuleRegistry, type TurboModule } from 'react-native';

export interface Spec extends TurboModule {
  exitApp(): void;
}

export default TurboModuleRegistry.getEnforcing<Spec>('Killer');
