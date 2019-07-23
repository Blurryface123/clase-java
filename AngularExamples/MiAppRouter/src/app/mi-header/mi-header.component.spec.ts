import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { MiHeaderComponent } from './mi-header.component';

describe('MiHeaderComponent', () => {
  let component: MiHeaderComponent;
  let fixture: ComponentFixture<MiHeaderComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ MiHeaderComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(MiHeaderComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
